package animated_music_box;

import javax.sound.midi.*;
import javax.swing.*;

/**
 * Created by Umang on 14-11-2016.
 */
public class MiniMusicPlayer {

    static JFrame frame=new JFrame("Video visualization of music!");
    static MyDrawPanel design;

    public static void main(String[] args) {

        MiniMusicPlayer mini=new MiniMusicPlayer();
        mini.go();
    }

    public void go() {

        setUpGui();

        try{

            Sequencer seq= MidiSystem.getSequencer();
            seq.open();
            seq.addControllerEventListener(design,new int[] {127});
            Sequence s=new Sequence(Sequence.PPQ,4);
            Track track=s.createTrack();

            for(int i=0;i<100;i+=4){

                int r= (int) ((Math.random()*50)+1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,100,i));
                track.add(makeEvent(128,1,r,100,i+2));
            }

            seq.setSequence(s);
            seq.start();
            seq.setTempoInBPM(120);

        } catch (Exception e) {

        }


    }

    public MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {

        MidiEvent event=null;

        try{

            ShortMessage sm=new ShortMessage();
            sm.setMessage(cmd,chan,one,two);
            event=new MidiEvent(sm,tick);
        }

        catch(Exception e){}

            return event;

    }

    public void setUpGui() {

        design=new MyDrawPanel();
        frame.setContentPane(design);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);
    }


}

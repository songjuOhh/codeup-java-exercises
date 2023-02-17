package game;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.*;
import javax.sound.sampled.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class SoundThread {
    private Clip clip;
    private Player player;
    private boolean isLoop;
    private File audioFile;
    private FileInputStream fileInputStream;
    private BufferedInputStream bufferedInputStream;
    private AudioInputStream audioInputStream;


//    public SoundThread(String pathName, boolean isLoop){
//        try{
//            clip = AudioSystem.getClip();
//            audioFile = new File(pathName);
//            audioInputStream = AudioSystem.getAudioInputStream(audioFile);
//            clip.open(audioInputStream);
//        } catch (UnsupportedAudioFileException e) {
//            e.printStackTrace();
//        } catch (LineUnavailableException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void start() {
//        clip.setFramePosition(0);
//        clip.start();
//        if(isLoop) clip.loop(Clip.LOOP_CONTINUOUSLY);
//    }
//
//    public void stop() {
//        clip.stop();


    public static void main(String[] args) {
        introBGM iBGM = new introBGM();
        iBGM.start();

        knightUlt knUlt = new knightUlt();
        knUlt.start();

        magiUlt maUlt = new magiUlt();
        maUlt.start();

        assassinUlt assUlt = new assassinUlt();
        assUlt.start();

        berserkUlt brsUlt = new berserkUlt();
        brsUlt.start();

        devilAura dvAR = new devilAura();
        dvAR.start();

        attackSound atkS = new attackSound();
        atkS.start();

        devilAttack dvAtk = new devilAttack();
        dvAtk.start();

        burning burn = new burning();
        burn.start();

        punch punch = new punch();
        punch.start();

        axeATK axeATK = new axeATK();
        axeATK.start();

        assATK assATK = new assATK();
        assATK.start();

        Village Village = new Village();
        Village.start();

        TheChoice TheChoice = new TheChoice();
        TheChoice.start();

        UP UP = new UP();
        UP.start();

        Recover Recover = new Recover();
        Recover.start();

        Battle Battle = new Battle();
        Battle.start();

        Sad Sad = new Sad();
        Sad.start();

        Dark Dark = new Dark();
        Dark.start();

        Ghost Ghost = new Ghost();
        Ghost.start();

        Hungry Hungry = new Hungry();
        Hungry.start();

        DogC DogC = new DogC();
        DogC.start();

        Eating Eating = new Eating();
        Eating.start();

        GameoverS GameoverS = new GameoverS();
        GameoverS.start();

        DarkEnd DarkEnd = new DarkEnd();
        DarkEnd.start();

        Holy Holy = new Holy();
        Holy.start();

        DefenceS   DefenceS   = new DefenceS  ();
        DefenceS  .start();

        Shield Shield = new Shield();
        Shield.start();

        WizardAtk WizardAtk = new WizardAtk();
        WizardAtk.start();

        Shadow Shadow = new Shadow();
        Shadow.start();

        Open Open = new Open();
        Open.start();

        Drop Drop = new Drop();
        Drop.start();

        dbleSwing dbleSwing = new dbleSwing();
        dbleSwing.start();

    }

}

class introBGM extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/typeBGMshort.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
class knightUlt extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/flyingsword.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class magiUlt extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/holylight.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class assassinUlt extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/assassin.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class berserkUlt extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/berserk.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class devilAura extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/devilaura2cut.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }

}

class attackSound extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/attack.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }

}
class devilAttack extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/devilattack.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }

}

class burning extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/burningCut.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class punch extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/punch.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
class axeATK extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/axeATK.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
class assATK extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/assATK.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
class Village extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Village.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class TheChoice extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/TheChoice.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class UP extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/UP.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Recover extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Recover.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Battle extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Battle.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Sad extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Sad.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Dark extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Dark.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Ghost extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Ghost.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Hungry extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Hungry.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class DogC extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/DogC.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Eating extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Eating.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class GameoverS extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/gameover.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
class DarkEnd extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/DarkEnd.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Holy extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Holy.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class DefenceS   extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Defence.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Shield extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Shield.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class WizardAtk extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/WizardATK.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Shadow extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/Shadow.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Open extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/open.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class Drop extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/drop.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

class dbleSwing extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/game/Music/dbleSwing.mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}


package general;

import org.lwjgl.opengl.Display;

public class Options {
        private int speed = 1; // 1 = Normal
        private int dmg = 1; // 1 = Normal

        public boolean start() {

                //Speedregler
                Button Speed = new Button();
                Speed.addButton(300, 100, "../gamejam/src/Options_texture/speed.png");
                Button SpeedNormal = new Button();
                SpeedNormal.addButton(700, 140,        "../gamejam/src/Options_texture/SpeedNormal.png");
                Button SpeedLangsam = new Button();
                SpeedLangsam.addButton(700, 140,"../gamejam/src/Options_texture/SpeedLangsam.png");
                Button SpeedSchnell = new Button();
                SpeedSchnell.addButton(700, 140,"../gamejam/src/Options_texture/SpeedSchnell.png");
                Button SpeedSuperSchnell = new Button();
                SpeedSuperSchnell.addButton(700, 140,"../gamejam/src/Options_texture/SpeedSuperSchnell.png");
                Button SpeedMinus = new Button();
                SpeedMinus.addButton(600, 150, "../gamejam/src/Options_texture/Minus.png");
                Button SpeedPlus = new Button();
                SpeedPlus.addButton(900, 150, "../gamejam/src/Options_texture/Plus.png");
                
                //Damageregler
                Button Dmg = new Button();
                Dmg.addButton(300, 300, "../gamejam/src/Options_texture/dmg.png");
                Button DmgNormal = new Button();
                DmgNormal.addButton(700, 340,        "../gamejam/src/Options_texture/SpeedNormal.png");
                Button DmgWenig = new Button();
                DmgWenig.addButton(700, 340,"../gamejam/src/Options_texture/SpeedLangsam.png");
                Button DmgViel = new Button();
                DmgViel.addButton(700, 340,"../gamejam/src/Options_texture/SpeedSchnell.png");
                Button DmgSehrViel = new Button();
                DmgSehrViel.addButton(700, 340,"../gamejam/src/Options_texture/SpeedSuperSchnell.png");
                Button DmgMinus = new Button();
                DmgMinus.addButton(600, 350, "../gamejam/src/Options_texture/Minus.png");
                Button DmgPlus = new Button();
                DmgPlus.addButton(900, 350, "../gamejam/src/Options_texture/Plus.png");
                
                
                Button back = new Button();
                back.addButton(900, 500, "../gamejam/src/Textures/Back.png");

                Button black = new Button();
                black.addButton(0, 0, "../gamejam/src/Textures/schwarz.png");

                long frame = 0;
                while (!Display.isCloseRequested()) {

                        // render OpenGL here
                        black.Draw();
                        Speed.Draw();
                        Dmg.Draw();
                        SpeedMinus.Draw();
                        SpeedPlus.Draw();
                        DmgMinus.Draw();
                        DmgPlus.Draw();
                        back.Draw();

                        switch (speed) {
                        case (0):
                                SpeedLangsam.Draw();break;
                        case (1):
                                SpeedNormal.Draw();break;
                        case (2):
                                SpeedSchnell.Draw();break;
                        case (3):
                                SpeedSuperSchnell.Draw();break;
                        }
                        
                        switch(dmg){
                        case(0):
                                DmgWenig.Draw();break;
                        case(1):
                                DmgNormal.Draw();break;
                        case(2):
                                DmgViel.Draw();break;
                        case(3):
                                DmgSehrViel.Draw();break;
                        }

                        if (frame > 5) {
                                frame = 0;
                                if (back.isClicked) {
                                        return true;
                                }

                                if (SpeedMinus.isClicked) {
                                        if (!(speed == 0)) {
                                                speed--;
                                        }
                                        switch (speed) {
                                        case (0):
                                                settings.deltaMove = 2;
                                                break;
                                        case (1):
                                                settings.deltaMove = 4;
                                                break;
                                        case (2):
                                                settings.deltaMove = 8;
                                                break;
                                        case (3):
                                                settings.deltaMove = 16;
                                                break;
                                        }
                                }

                                if (SpeedPlus.isClicked) {
                                        if (!(speed == 3)) {
                                                speed++;
                                        }
                                        switch (speed) {
                                        case (0):
                                                settings.deltaMove = 2;
                                                break;
                                        case (1):
                                                settings.deltaMove = 4;
                                                break;
                                        case (2):
                                                settings.deltaMove = 8;
                                                break;
                                        case (3):
                                                settings.deltaMove = 16;
                                                break;
                                        }
                                }
                                
                                if (DmgMinus.isClicked) {
                                        if (!(dmg == 0)) {
                                                dmg--;
                                        }
                                        switch (dmg) {
                                        case (0):
                                                settings.deltaHit = 2;break;
                                        case (1):
                                                settings.deltaHit = 5;break;
                                        case (2):
                                                settings.deltaHit = 10;break;
                                        case (3):
                                                settings.deltaHit = 15;break;
                                        }
                                }
                                
                                if (DmgPlus.isClicked) {
                                        if (!(dmg == 3)) {
                                                dmg++;
                                        }
                                        switch (dmg) {
                                        case (0):
                                                settings.deltaHit = 2;break;
                                        case (1):
                                                settings.deltaHit = 5;break;
                                        case (2):
                                                settings.deltaHit = 10;break;
                                        case (3):
                                                settings.deltaHit = 15;break;
                                        }
                                }
                                
                        }
                        Display.update();
                        Display.sync(60);

                        frame++;

                }
                Display.destroy();

                return false;

        }
}
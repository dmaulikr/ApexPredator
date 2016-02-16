/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts.library;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.objects.Monster.BodyParts.Head;
import com.mygdx.game.objects.Monster.BodyParts.LeftArm;
import com.mygdx.game.objects.Monster.BodyParts.RightArm;

/**
 *
 * @author Kyle
 */
public class ArmLibrary {
    Texture RArmSheet;
    Texture LArmSheet;
    int xPos;
    int yPos;
    
    public ArmLibrary(){
        RArmSheet = new Texture("RArms.png");
        LArmSheet = new Texture("LArms.png");
    }
    
    public RightArm LoadRArm(int choice){
        RightArm rArm = null;
        switch(choice){
            case 0:
                rArm = new RightArm();
                rArm.name = "DemiRArm";
                rArm.partImg = new TextureRegion[3];
                rArm.partImg[0] = new TextureRegion(RArmSheet, 0, 0, 64, 64);
                rArm.partImg[1] = new TextureRegion(RArmSheet, 64, 0, 64, 64);
                rArm.partImg[2] = new TextureRegion(RArmSheet, 64*2, 0, 64, 64);
                rArm.xAdjust = 0;
                rArm.yAdjust =0;
                break;
            case 1:
                rArm = new RightArm();
                rArm.name = "Yellow Wing";
                rArm.partImg = new TextureRegion[1];
                rArm.partImg[0] = new TextureRegion(RArmSheet, 0, 64, 64, 64);
                rArm.xAdjust = 0;
                rArm.yAdjust = 0;
                break;
            case 2:
                rArm = new RightArm();
                rArm.name = "Clawed Yellow";
                rArm.partImg = new TextureRegion[3];
                rArm.partImg[0] = new TextureRegion(RArmSheet, 0, 64*2, 64, 64);
                rArm.partImg[1] = new TextureRegion(RArmSheet, 64, 64*2, 64, 64);
                rArm.partImg[2] = new TextureRegion(RArmSheet, 64*2, 64*2, 64, 64);
                rArm.xAdjust = -5;
                rArm.yAdjust = 0;
        }
        return rArm;
    }
    
    public LeftArm LoadLArm(int choice){
        LeftArm LArm = null;
        switch(choice){
            case 0:
                LArm = new LeftArm();
                LArm.name = "DemiLArm";
                LArm.partImg = new TextureRegion[1];
                LArm.partImg[0] = new TextureRegion(LArmSheet, 0, 0, 64, 64);
                LArm.xAdjust = 0;
                LArm.yAdjust = 5;
                break;
            case 1:
                LArm = new LeftArm();
                LArm.name = "Yellow Wing";
                LArm.partImg = new TextureRegion[1];
                LArm.partImg[0] = new TextureRegion(LArmSheet, 0, 64, 64, 64);
                LArm.xAdjust = 0;
                LArm.yAdjust = 0;
                break;
            case 2:
                LArm = new LeftArm();
                LArm.name = "Clawed Yellow";
                LArm.partImg = new TextureRegion[3];
                LArm.partImg[0] = new TextureRegion(RArmSheet, 0, 64*2, 64, 64);
                LArm.partImg[1] = new TextureRegion(RArmSheet, 64, 64*2, 64, 64);
                LArm.partImg[2] = new TextureRegion(RArmSheet, 64*2, 64*2, 64, 64);
                LArm.xAdjust = -5;
                LArm.yAdjust = 0;
        }
        return LArm;
    }
}

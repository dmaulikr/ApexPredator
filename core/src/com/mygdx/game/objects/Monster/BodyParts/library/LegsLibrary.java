/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts.library;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.objects.Monster.BodyParts.Legs;
import com.mygdx.game.objects.Monster.BodyParts.RightArm;

/**
 *
 * @author Kyle
 */
public class LegsLibrary {
    Texture legSheet;
    int xPos;
    int yPos;
    
    public LegsLibrary(){
        legSheet = new Texture("Legs.png");
    }
    
    public Legs LoadRLeg(int choice){
        Legs rLeg = null;
        switch(choice){
            case 0:
                rLeg = new Legs();
                rLeg.name = "StickLegs";
                rLeg.partImg = new TextureRegion[4];
                rLeg.partImg[0] = new TextureRegion(legSheet, 0, 0, 64, 64);
                rLeg.partImg[1] = new TextureRegion(legSheet, 64, 0, 64, 64);
                rLeg.partImg[2] = new TextureRegion(legSheet, 64*2, 0, 64, 64);
                rLeg.partImg[2] = new TextureRegion(legSheet, 64*3, 0, 64, 64);
                rLeg.xAdjust = 0;
                rLeg.yAdjust = 0;
                break;
        }
        return rLeg;
    }
    
    public Legs LoadLLeg(int choice){
        Legs lLeg = null;
        switch(choice){
            case 0:
                lLeg = new Legs();
                lLeg.name = "StickLegs";
                lLeg.partImg = new TextureRegion[4];
                lLeg.partImg[0] = new TextureRegion(legSheet, 0, 64, 64, 64);
                lLeg.partImg[1] = new TextureRegion(legSheet, 64, 64, 64, 64);
                lLeg.partImg[2] = new TextureRegion(legSheet, 64*2, 64, 64, 64);
                lLeg.partImg[2] = new TextureRegion(legSheet, 64*3, 64, 64, 64);
                lLeg.xAdjust = 0;
                lLeg.yAdjust = 0;
                break;
        }
        return lLeg;
    }
}

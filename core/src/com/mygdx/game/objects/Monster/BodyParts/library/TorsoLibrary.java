/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts.library;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.objects.Monster.BodyParts.Head;
import com.mygdx.game.objects.Monster.BodyParts.LimbSlot;
import com.mygdx.game.objects.Monster.BodyParts.Torso;

/**
 *
 * @author Kyle
 */
public class TorsoLibrary {
    Texture torsoSheet;
    int xPos;
    int yPos;
    
    public TorsoLibrary(){
        torsoSheet = new Texture("Torso.png");
    }
    
    public Torso LoadBody(int choice){
        Torso body = null;
        switch(choice){
            case 0:
                body = new Torso();
                body.name = "DemiBody";
                body.partImg = new TextureRegion[1];
                body.partImg[0] = new TextureRegion(torsoSheet, 0, 0, 64, 64);
                //Must be in pairs for left and right, so add 2
                body.armSlots = new LimbSlot[2];
                body.armSlots[0] = new LimbSlot(-3, 4);
                body.armSlots[1] = new LimbSlot(0, 5);
                //Must be in pairs for left and right, so add 2
                body.legSlots = new LimbSlot[2];
                body.legSlots[0] = new LimbSlot(-4, -11);
                body.legSlots[1] = new LimbSlot(0, -10);
                //Will just add neck extension later, will just clip onto this
                body.headSlots = new LimbSlot[1];
                body.headSlots[0] = new LimbSlot(1, 5);
                break;
            case 1:
                body = new Torso();
                body.name = "Mini-Shark";
                body.partImg = new TextureRegion[1];
                body.partImg[0] = new TextureRegion(torsoSheet, 64, 0, 64, 64);
                //Must be in pairs for left and right, so add 2
                body.armSlots = new LimbSlot[2];
                body.armSlots[0] = new LimbSlot(-3, 3);
                body.armSlots[1] = new LimbSlot(0, 4);
                //Must be in pairs for left and right, so add 2
                body.legSlots = new LimbSlot[2];
                body.legSlots[0] = new LimbSlot(-3, -3);
                body.legSlots[1] = new LimbSlot(0, -2);
                //Will just add neck extension later, will just clip onto this
                body.headSlots = new LimbSlot[1];
                body.headSlots[0] = new LimbSlot(5, 2);
                break;
            case 2:
                body = new Torso();
                body.name = "Bird Nail";
                body.partImg = new TextureRegion[1];
                body.partImg[0] = new TextureRegion(torsoSheet, 64*2, 0, 64, 64);
                //Must be in pairs for left and right, so add 2
                body.armSlots = new LimbSlot[2];
                body.armSlots[0] = new LimbSlot(-4, 3);
                body.armSlots[1] = new LimbSlot(-1, 4);
                //Must be in pairs for left and right, so add 2
                body.legSlots = new LimbSlot[2];
                body.legSlots[0] = new LimbSlot(-5, -12);
                body.legSlots[1] = new LimbSlot(-1, -11);
                //Will just add neck extension later, will just clip onto this
                body.headSlots = new LimbSlot[1];
                body.headSlots[0] = new LimbSlot(8, 4);
                break;
                
        }
        return body;
    }
}

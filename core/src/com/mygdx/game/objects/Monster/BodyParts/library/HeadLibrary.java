/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts.library;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.objects.Monster.BodyParts.Head;

/**
 *
 * @author Kyle
 */
public class HeadLibrary {
    Texture headSheet;
    int xPos;
    int yPos;
    
    public HeadLibrary(){
        headSheet = new Texture("Head.png");
    }
    
    public Head LoadHead(int choice){
        Head head = null;
        switch(choice){
            case 0:
                head = new Head();
                head.name = "DemiHead";
                head.partImg = new TextureRegion[1];
                head.partImg[0] = new TextureRegion(headSheet, 0, 0, 64, 64);
                head.xAdjust = 0;
                head.yAdjust = -9;
                break;
            case 1:
                head = new Head();
                head.name = "Cycloptic";
                head.partImg = new TextureRegion[1];
                head.partImg[0] = new TextureRegion(headSheet, 64, 0, 64, 64);
                head.xAdjust = -10;
                head.yAdjust = -7;
                break;
        }
        return head;
    }
}

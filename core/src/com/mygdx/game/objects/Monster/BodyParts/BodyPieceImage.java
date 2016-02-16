/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author Kyle
 */
public class BodyPieceImage {
    Texture pieceImg;
    int frameNum;
    int size;
    
    public BodyPieceImage(){
        
    }
    
    public TextureRegion[] loadImage(int imgChoiceRow, int imgChoiceCol, int frameNum, int size){
        TextureRegion imgArray[] = new TextureRegion[frameNum];
        for(int i = 0; i < frameNum; i++){
            imgArray[i] = new TextureRegion(pieceImg, imgChoiceRow*size, imgChoiceCol*size, size, size);
        }
        return imgArray;
    }
}

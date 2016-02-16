/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.objects.Monster.BodyParts.BodyParts;
import com.mygdx.game.objects.Monster.BodyParts.Torso;
import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
public class SmallCreature extends BasicCreature{

    
    public SmallCreature(Torso body){
        this.body = body;
        this.headList = new ArrayList<BodyParts>();
        this.armsList = new ArrayList<BodyParts>();
        this.legsList = new ArrayList<BodyParts>();
    }
    
    public void AttachHead(){
        body.headSlots[0].limb = headList.get(0);
    }
    
    public void AttachArms(int limbNum){
        body.armSlots[limbNum].limb = armsList.get(limbNum);
    }
    
    public void AttachLegs(int limbNum){
        body.legSlots[limbNum].limb = legsList.get(limbNum);
    }
    
    @Override
    public void Render(SpriteBatch batch) {
        //Draw left arms
        if(body.armSlots.length > 1){
            body.armSlots[1].RenderLimb(batch);
        }
        //Draw left legs
        if(body.legSlots.length > 1){
            body.legSlots[1].RenderLimb(batch);
        }
        //Draw body
        body.RenderPart(batch);
        //Draw head
        if(body.headSlots.length == 1){
            body.headSlots[0].RenderLimb(batch);
        }
        //Draw right legs
        if(body.legSlots.length > 1){
            body.legSlots[0].RenderLimb(batch);
        }
        //Draw right arms
        if(body.armSlots.length > 1){
            body.armSlots[0].RenderLimb(batch);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.objects.Monster.BodyParts.library;

import com.mygdx.game.objects.Monster.BodyParts.Head;
import com.mygdx.game.objects.Monster.BodyParts.LeftArm;
import com.mygdx.game.objects.Monster.BodyParts.Legs;
import com.mygdx.game.objects.Monster.BodyParts.RightArm;
import com.mygdx.game.objects.Monster.BodyParts.Torso;

/**
 *
 * @author Kyle
 */
public class MainLibrary {
    HeadLibrary headLib;
    TorsoLibrary torsoLib;
    ArmLibrary armLib;
    LegsLibrary legLib;
    
    public MainLibrary(){
        headLib = new HeadLibrary();
        torsoLib = new TorsoLibrary();
        armLib = new ArmLibrary();
        legLib = new LegsLibrary();
    }
    
    public Head GetHead(int choice){
        return headLib.LoadHead(choice);
    }
    
    public Torso GetTorso(int choice){
        return torsoLib.LoadBody(choice);
    }
    
    public RightArm GetRArm(int choice){
        return armLib.LoadRArm(choice);
    }
    
    public LeftArm GetLArm(int choice){
        return armLib.LoadLArm(choice);
    }
    
    public Legs GetLLeg(int choice){
        return legLib.LoadRLeg(choice);
    }
    
    public Legs GetRLeg(int choice){
        return legLib.LoadLLeg(choice);
    }
}

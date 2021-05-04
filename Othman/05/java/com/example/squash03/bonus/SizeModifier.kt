package com.example.squash03.bonus

import android.graphics.RectF
import com.example.squash03.game.Balle
import com.example.squash03.game.DrawingView


class SizeModifier(x: Float,y: Float,diametre: Float,isGentle: Boolean) : SpecialObject(x,y,diametre, isGentle) {
    /** Objectif : changer la taille de la balle
     *  Héritage : hérite de specialObject, permet de créer les objets activables bonus/malus **/
    override fun Activate(b: Balle, view: DrawingView) {
        super.Activate(b, view)
        if (isGentle) {
            b.changeTaille(2) // SizeUp Bonus
        } else {
            b.changeTaille(3) // SizeDown Malus
        }
    }
}
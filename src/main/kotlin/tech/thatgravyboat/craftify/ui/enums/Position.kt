package tech.thatgravyboat.craftify.ui.enums

import gg.essential.elementa.UIComponent
import gg.essential.elementa.constraints.CenterConstraint
import gg.essential.elementa.constraints.XConstraint
import gg.essential.elementa.constraints.YConstraint
import gg.essential.elementa.dsl.minus
import gg.essential.elementa.dsl.percent
import gg.essential.elementa.dsl.pixel

enum class Position(val x: (UIComponent.() -> XConstraint), val y: (UIComponent.() -> YConstraint)) {
    TOPLEFT({ 0.percent() }, { 0.percent() }),
    TOPMIDDLE({ CenterConstraint() }, { 0.percent() }),
    TOPRIGHT({ 100.percent() - 150.pixel() }, { 0.percent() }),
    MIDDLELEFT({ 0.percent() }, { CenterConstraint() }),
    MIDDLERIGHT({ 100.percent() - 150.pixel() }, { CenterConstraint() }),
    BOTTOMLEFT({ 0.percent() }, { 100.percent() - 50.pixel() }),
    BOTTOMMIDDLE({ CenterConstraint() }, { 100.percent() - 50.pixel() }),
    BOTTOMRIGHT({ 100.percent() - 150.pixel() }, { 100.percent() - 50.pixel() })
}

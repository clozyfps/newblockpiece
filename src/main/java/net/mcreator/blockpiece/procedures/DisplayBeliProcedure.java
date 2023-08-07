package net.mcreator.blockpiece.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayBeliProcedure {
	public static String execute() {
		return new java.text.DecimalFormat("##.##").format() + "";
	}
}

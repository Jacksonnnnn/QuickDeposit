package com.Jacksonnn.QuickDeposit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class QuickDeposit extends JavaPlugin{
	public void onEnable() {
		Bukkit.getServer().getLogger().info(ChatColor.YELLOW + "[QuickDeposit] QuickDeposit has sucessfully been enabled!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.YELLOW + "[QuickDeposit] QuickDeposit has sucessfully been disabled!");
	}
}

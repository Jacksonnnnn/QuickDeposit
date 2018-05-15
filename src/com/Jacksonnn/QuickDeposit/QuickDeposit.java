package com.Jacksonnn.QuickDeposit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class QuickDeposit extends JavaPlugin {
	
	public static QuickDeposit plugin;
	
	public String prefix = "ChatColor.DARK_GREY + \"[\" + ChatColor.YELLOW + \"QuickDeposit\" + ChatColor.DARK_GREY + \"] \"";
	
	public void onEnable() {
		plugin = this;
		Bukkit.getServer().getLogger().info(prefix + ChatColor.YELLOW + "QuickDeposit has sucessfully been enabled!");
		
		registerListeners();
	}
	
	private void registerListeners() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		
		pm.registerEvents(new QuickDepositListener(), this);
	}

	public void onDisable() {
		Bukkit.getServer().getLogger().info(prefix + ChatColor.YELLOW + "[QuickDeposit] QuickDeposit has sucessfully been disabled!");
	}
}

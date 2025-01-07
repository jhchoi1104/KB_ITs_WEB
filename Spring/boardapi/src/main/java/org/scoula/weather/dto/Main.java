package org.scoula.weather.dto;

import lombok.Data;

@Data
public class Main{
	private double temp;
	private double temp_min;
	private int grnd_level;
	private int humidity;
	private int pressure;
	private int seaLevel;
	private double feels_like;
	private double temp_max;
}
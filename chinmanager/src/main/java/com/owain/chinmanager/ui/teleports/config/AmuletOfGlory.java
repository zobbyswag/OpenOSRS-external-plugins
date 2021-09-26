package com.owain.chinmanager.ui.teleports.config;

import io.reactivex.rxjava3.annotations.NonNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AmuletOfGlory
{
	AMULET_OF_GLORY("Amulet of glory"),
	POH("PoH (Jewellery box)"),

	;

	private final @NonNull String name;

	@Override
	public @NonNull String toString()
	{
		return name;
	}
}

package com.emids.testclasses;

import org.junit.Assert;
import org.junit.Test;

import com.emids.services.Inventory;

public class InventoryTest {
	Inventory inv = new Inventory();

	@Test
	public void WhenuserentersjavaThenitmustdisplaythejavarelatedbooks() {

		inv.searchBybookName("java");

	}

	@Test
	public void WhenUserentersthebooknamewhichisnotprasentininventoryThenitmustsshowthisbookisnotavailable() {
		inv.searchBybookName("dgfgu");

	}

	@Test
	public void WhenUserenterstheauthernameasraghuthenitshowstherelatedbooks() {
		inv.searchBybookName("raghu");

	}

	@Test
	public void WhenUserentersthewrongbooknameThenitmustdisplaysbookisnotavailable() {
		inv.searchBybookName("dgfgu");

	}
	@Test
	public void WhenshowallmethodiscalledThenitmustshowallthebooksintheproducts()
	{
		inv.showAll();
	}
}

/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.boschspexor.internal.api.model;

import org.eclipse.jdt.annotation.NonNullByDefault;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representation object of Engery information
 *
 * @author Marc Fischer - Initial contribution
 */
@NonNullByDefault
public class Energy {
    /**
     * Possible Energy Modes
     *
     */
    public enum EnergyMode {
        @JsonProperty("EnergySavingOff")
        ENERGY_SAVING_OFF,
        @JsonProperty("EnergySavingAlwaysOn")
        ENERGY_SAVING_ALWAYS_ON,
        @JsonProperty("EnergySavingOnBattery")
        ENERGY_SAVING_ON_BATTERY
    }

    private SensorValue<Integer> stateOfCharge = new SensorValue<Integer>();
    private EnergyMode energyMode = EnergyMode.ENERGY_SAVING_ALWAYS_ON;
    @JsonProperty("isPowered")
    private boolean powered = false;

    public SensorValue<Integer> getStateOfCharge() {
        return stateOfCharge;
    }

    public void setStateOfCharge(SensorValue<Integer> stateOfCharge) {
        this.stateOfCharge = stateOfCharge;
    }

    public EnergyMode getEnergyMode() {
        return energyMode;
    }

    public void setEnergyMode(EnergyMode energyMode) {
        this.energyMode = energyMode;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }
}

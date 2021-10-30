/*
 * Stream-Pi - Free & Open-Source Modular Cross-Platform Programmable Macro Pad
 * Copyright (C) 2019-2021  Debayan Sutradhar (rnayabed),  Samuel Quiñones (SamuelQuinones)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.stream_pi.action_api.action;

import java.net.SocketAddress;

public interface PropertySaver
{
    void saveServerProperties();
    void saveClientAction(String profileID, String actionID, SocketAddress clientSocketAddress, boolean sendIcons, boolean runAsync);
    void saveAllIcons(String profileID, String actionID, SocketAddress clientSocketAddress);
    void saveIcon(String state, String profileID, String actionID, SocketAddress clientSocketAddress);
}

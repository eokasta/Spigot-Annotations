/**
 *
 * Copyright (C) 2017 - 2018  HexagonMc <https://github.com/HexagonMC>
 * Copyright (C) 2017 - 2018  Zartec <zartec@mccluster.eu>
 *
 *     This file is part of Spigot-Annotations.
 *
 *     Spigot-Annotations is free software:
 *     you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Spigot-Annotations is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Spigot-Annotations.
 *     If not, see <http://www.gnu.org/licenses/>.
 */
package eu.hexagonmc.spigot.annotation.test;

import eu.hexagonmc.spigot.annotation.test.meta.DependencyTypeTest;
import eu.hexagonmc.spigot.annotation.test.meta.PluginCommandTest;
import eu.hexagonmc.spigot.annotation.test.meta.PluginDependencyTest;
import eu.hexagonmc.spigot.annotation.test.meta.PluginMetadataTest;
import eu.hexagonmc.spigot.annotation.test.meta.PluginPermissionTest;
import eu.hexagonmc.spigot.annotation.test.meta.PluginYmlTest;
import org.junit.runner.JUnitCore;

public class Test {

    public static void main(String[] args) {
        JUnitCore.runClasses(
                DependencyTypeTest.class,
                PluginMetadataTest.class,
                PluginPermissionTest.class,
                PluginCommandTest.class,
                PluginDependencyTest.class,
                PluginYmlTest.class,
                AnnotationProcessorTest.class);
    }

}

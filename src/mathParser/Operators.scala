/*
 * Copyright (C) 2016  Gregor Ihmor
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package mathParser

trait Named {
  val name: Symbol
}

trait Constant[Skalar] extends Named {
  val apply: Skalar
}

trait UnitaryOperator[Skalar] extends Named {
  val apply: Skalar => Skalar
}

trait BinaryOperator[Skalar] extends Named {
  val apply: (Skalar, Skalar) => Skalar
}

trait Literal[Skalar] {
  val apply: Skalar
}
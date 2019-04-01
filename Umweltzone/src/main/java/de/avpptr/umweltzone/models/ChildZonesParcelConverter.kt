/*
 *  Copyright (C) 2019  Tobias Preuss
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.avpptr.umweltzone.models

import android.os.Parcel
import android.os.Parcelable

import org.parceler.Parcels
import org.parceler.converter.ArrayListParcelConverter

class ChildZonesParcelConverter : ArrayListParcelConverter<ChildZone>() {

    override fun itemToParcel(input: ChildZone, parcel: Parcel) {
        parcel.writeParcelable(Parcels.wrap(input), NO_FLAGS)
    }

    override fun itemFromParcel(parcel: Parcel): ChildZone = Parcels.unwrap<ChildZone>(
            parcel.readParcelable<Parcelable>(ChildZone::class.java.classLoader))

    companion object {
        private const val NO_FLAGS = 0
    }

}

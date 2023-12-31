/*
 * Copyright 2006 Web Cohesion Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package webserver.com.website.war.impl;

import javax.jws.WebService;
import javax.ws.rs.Path;

import webserver.com.website.war.api.PermissionDeniedException;
import webserver.com.website.war.api.PersonaService;
import webserver.com.website.war.domain.persona.Persona;

/**
 * @author Ryan Heaton
 */
@WebService(endpointInterface = "webserver.com.website.war.api.PersonaService")
@Path("/persona")
public class PersonaServiceImpl implements PersonaService
{

    public Persona readPersona(final String personaId)
    {
        final Persona persona = new Persona();
        // ...load the persona from the db, etc...
        return persona;
    }

    public Persona readPersonaJson()
    {
        final Persona persona = new Persona();
        // ...load the persona from the db, etc...
        return persona;
    }

    public void storePersona(final Persona persona)
    {
        // ... store the persona in the db...
    }

    public boolean deletePersona(final String personaId) throws PermissionDeniedException
    {
        // ..do the delete, throw permission denied as necessary...
        return true;
    }
}

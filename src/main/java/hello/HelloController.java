package hello;

import com.ge.ev.commons.json.JsonMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;

@RestController
public class HelloController {

    private LinkedHashMap<String, Object> buildResponse(HttpServletRequest request)
    {
        LinkedHashMap<String, Object> response = new LinkedHashMap<>();

        response.put("uri", request.getRequestURI());
        response.put("method", request.getMethod());
        response.put("remoteUser", request.getRemoteUser());
        response.put("remoteHost", request.getRemoteHost());
        response.put("remoteAddr", request.getRemoteAddr());
        response.put("remotePort", request.getRemotePort());
        response.put("authType", request.getAuthType());
        return response;
    }

    @RequestMapping(value="welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getWelcome(HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }


    @RequestMapping(value="resource", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getResource(HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="resource", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postResource(@RequestBody String body, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="admin", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAdmin(HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="assets/{asset_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getAssets(@PathVariable String asset_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("assetId", asset_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="assets/{asset_id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  postAssets(@PathVariable String asset_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("assetId", asset_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }


    @RequestMapping(value="sites/{site_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getSites(@PathVariable String site_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("siteId", site_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="sites/{site_id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  postSites(@PathVariable String site_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("siteId", site_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="sites/{site_id}/assets/{asset_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getSiteAssets(@PathVariable String site_id, @PathVariable String asset_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("siteId", site_id);
        response.put("assetId", asset_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }

    @RequestMapping(value="sites/{site_id}/assets/{asset_id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  postSiteAssets(@PathVariable String site_id, @PathVariable String asset_id, HttpServletRequest request) throws Exception {
        LinkedHashMap<String, Object> response = buildResponse(request);
        response.put("siteId", site_id);
        response.put("assetId", asset_id);
        return new ResponseEntity<>(JsonMapper.mapToJson(response), HttpStatus.OK);
    }
    
}

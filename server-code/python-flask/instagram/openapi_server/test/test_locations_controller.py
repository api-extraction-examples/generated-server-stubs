import unittest

from flask import json

from openapi_server.models.location_info_response import LocationInfoResponse  # noqa: E501
from openapi_server.models.location_search_response import LocationSearchResponse  # noqa: E501
from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLocationsController(BaseTestCase):
    """LocationsController integration test stubs"""

    def test_locations_location_id_get(self):
        """Test case for locations_location_id_get

        Get information about a location.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/locations/{location_id}'.format(location_id='location_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_locations_location_id_media_recent_get(self):
        """Test case for locations_location_id_media_recent_get

        Get a list of recent media objects from a given location.
        """
        query_string = [('min_timestamp', 56),
                        ('max_timestamp', 56),
                        ('min_id', 'min_id_example'),
                        ('max_id', 'max_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/locations/{location_id}/media/recent'.format(location_id='location_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_locations_search_get(self):
        """Test case for locations_search_get

        Search for a location by geographic coordinate.
        """
        query_string = [('distance', 56),
                        ('facebook_places_id', 'facebook_places_id_example'),
                        ('foursquare_id', 'foursquare_id_example'),
                        ('lat', 3.4),
                        ('lng', 3.4),
                        ('foursquare_v2_id', 'foursquare_v2_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/locations/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

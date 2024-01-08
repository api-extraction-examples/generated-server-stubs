import unittest

from flask import json

from openapi_server.models.media_entry_response import MediaEntryResponse  # noqa: E501
from openapi_server.models.media_search_response import MediaSearchResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMediaController(BaseTestCase):
    """MediaController integration test stubs"""

    def test_media_media_id_get(self):
        """Test case for media_media_id_get

        Get information about a media object.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}'.format(media_id='media_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_popular_get(self):
        """Test case for media_popular_get

        Get a list of currently popular media.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/popular',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_search_get(self):
        """Test case for media_search_get

        Search for media in a given area.
        """
        query_string = [('lat', 3.4),
                        ('lng', 3.4),
                        ('min_timestamp', 56),
                        ('max_timestamp', 56),
                        ('distance', 56)]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_shortcode_shortcode_get(self):
        """Test case for media_shortcode_shortcode_get

        Get information about a media object.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/shortcode/{shortcode}'.format(shortcode='shortcode_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

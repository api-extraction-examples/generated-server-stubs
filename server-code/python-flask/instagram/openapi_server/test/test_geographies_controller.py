import unittest

from flask import json

from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGeographiesController(BaseTestCase):
    """GeographiesController integration test stubs"""

    def test_geographies_geo_id_media_recent_get(self):
        """Test case for geographies_geo_id_media_recent_get

        Get recent media from a custom geo-id.
        """
        query_string = [('count', 56),
                        ('min_id', 'min_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/geographies/{geo_id}/media/recent'.format(geo_id='geo_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.venue import Venue  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVenuesController(BaseTestCase):
    """VenuesController integration test stubs"""

    def test_get_venues(self):
        """Test case for get_venues

        Arena and venue information
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/venues',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

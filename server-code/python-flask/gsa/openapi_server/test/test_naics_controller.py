import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestNaicsController(BaseTestCase):
    """NaicsController integration test stubs"""

    def test_list_naics_get(self):
        """Test case for list_naics_get

        This endpoint lists all of the NAICS codes that are relevant to the OASIS family of vehicles
        """
        headers = { 
            'Accept': '*/*',
        }
        response = self.client.open(
            '/api/naics/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestVendorsController(BaseTestCase):
    """VendorsController integration test stubs"""

    def test_list_vendors_get(self):
        """Test case for list_vendors_get

        This endpoint returns a list of vendors filtered by a NAICS code
        """
        query_string = [('naics', 'naics_example'),
                        ('setasides', ['setasides_example']),
                        ('vehicle', 'vehicle_example')]
        headers = { 
            'Accept': '*/*',
        }
        response = self.client.open(
            '/api/vendors/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

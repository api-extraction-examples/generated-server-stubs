import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestVendorController(BaseTestCase):
    """VendorController integration test stubs"""

    def test_get_vendor_get(self):
        """Test case for get_vendor_get

        This endpoint returns a single vendor by their 9 digit DUNS number
        """
        headers = { 
            'Accept': '*/*',
        }
        response = self.client.open(
            '/api/vendor/{duns}'.format(duns='duns_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

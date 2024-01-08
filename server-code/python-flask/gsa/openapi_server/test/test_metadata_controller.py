import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestMetadataController(BaseTestCase):
    """MetadataController integration test stubs"""

    def test_metadata_get(self):
        """Test case for metadata_get

        This endpoint returns metadata for the most recent data loads of SAM and FPDS data
        """
        headers = { 
            'Accept': '*/*',
        }
        response = self.client.open(
            '/api/metadata/',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territories_response import TerritoriesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTerritoriesController(BaseTestCase):
    """TerritoriesController integration test stubs"""

    def test_territories_get_collection(self):
        """Test case for territories_get_collection

        
        """
        query_string = [('fields[territories]', ['fields_territories_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/territories',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

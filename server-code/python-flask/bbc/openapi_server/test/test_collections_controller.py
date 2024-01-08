import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.programmes_response import ProgrammesResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCollectionsController(BaseTestCase):
    """CollectionsController integration test stubs"""

    def test_get_collection_members(self):
        """Test case for get_collection_members

        Collection Members
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/collections/{pid}/members'.format(pid='pid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

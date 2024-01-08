import unittest

from flask import json

from openapi_server.models.metadata_refresh_mode import MetadataRefreshMode  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestItemRefreshController(BaseTestCase):
    """ItemRefreshController integration test stubs"""

    def test_post(self):
        """Test case for post

        Refreshes metadata for an item.
        """
        query_string = [('metadataRefreshMode', openapi_server.MetadataRefreshMode()),
                        ('imageRefreshMode', openapi_server.MetadataRefreshMode()),
                        ('replaceAllMetadata', False),
                        ('replaceAllImages', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/Refresh'.format(item_id='item_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

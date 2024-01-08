import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestDocsController(BaseTestCase):
    """DocsController integration test stubs"""

    def test_get_doc(self):
        """Test case for get_doc

        Get swagger documentation
        """
        headers = { 
        }
        response = self.client.open(
            '/v1/api-docs',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

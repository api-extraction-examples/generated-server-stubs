import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_query(self):
        """Test case for query

        Execute a SQLite SQL query against the content database
        """
        query_string = [('sql', 'sql_example'),
                        ('_shape', 'shape_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/content.json',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

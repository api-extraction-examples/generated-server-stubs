import unittest

from flask import json

from openapi_server.models.conference import Conference  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConferencesController(BaseTestCase):
    """ConferencesController integration test stubs"""

    def test_get_conferences(self):
        """Test case for get_conferences

        Conferences
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/conferences',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

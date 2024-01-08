import unittest

from flask import json

from openapi_server.models.halified_countries import HalifiedCountries  # noqa: E501
from openapi_server.test import BaseTestCase


class TestReferencesController(BaseTestCase):
    """ReferencesController integration test stubs"""

    def test_countries_get(self):
        """Test case for countries_get

        
        """
        query_string = [('page', 56),
                        ('pageSize', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/dealer_tryout/v1/countries',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

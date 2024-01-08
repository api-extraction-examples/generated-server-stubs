import unittest

from flask import json

from openapi_server.models.get_list_of_countries200_response_inner import GetListOfCountries200ResponseInner  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHelpController(BaseTestCase):
    """HelpController integration test stubs"""

    def test_get_list_of_countries(self):
        """Test case for get_list_of_countries

        getListOfCountries
        """
        query_string = [('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/help/countries',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

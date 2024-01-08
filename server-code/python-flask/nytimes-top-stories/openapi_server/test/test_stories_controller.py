import unittest

from flask import json

from openapi_server.models.section_format_get200_response import SectionFormatGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStoriesController(BaseTestCase):
    """StoriesController integration test stubs"""

    def test_section_format_get(self):
        """Test case for section_format_get

        Top Stories
        """
        query_string = [('callback', 'param_callback_example')]
        headers = { 
            'Accept': 'application/json',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/svc/topstories/v2/{section_format}'.format(section='section_example', format='format_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

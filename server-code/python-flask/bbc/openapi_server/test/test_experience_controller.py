import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.experience_response import ExperienceResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestExperienceController(BaseTestCase):
    """ExperienceController integration test stubs"""

    def test_get_experience_homepage(self):
        """Test case for get_experience_homepage

        Homepage Experience
        """
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/experience/homepage',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

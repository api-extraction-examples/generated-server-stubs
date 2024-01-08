import unittest

from flask import json

from openapi_server.models.coach import Coach  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCoachesController(BaseTestCase):
    """CoachesController integration test stubs"""

    def test_get_coaches(self):
        """Test case for get_coaches

        Coaching records and history
        """
        query_string = [('firstName', 'first_name_example'),
                        ('lastName', 'last_name_example'),
                        ('team', 'team_example'),
                        ('year', 56),
                        ('minYear', 56),
                        ('maxYear', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/coaches',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.drive import Drive  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDrivesController(BaseTestCase):
    """DrivesController integration test stubs"""

    def test_get_drives(self):
        """Test case for get_drives

        Drive data and results
        """
        query_string = [('seasonType', 'regular'),
                        ('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('offense', 'offense_example'),
                        ('defense', 'defense_example'),
                        ('conference', 'conference_example'),
                        ('offenseConference', 'offense_conference_example'),
                        ('defenseConference', 'defense_conference_example'),
                        ('classification', 'classification_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/drives',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.draft_pick import DraftPick  # noqa: E501
from openapi_server.models.draft_position import DraftPosition  # noqa: E501
from openapi_server.models.draft_team import DraftTeam  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDraftController(BaseTestCase):
    """DraftController integration test stubs"""

    def test_get_draft_picks(self):
        """Test case for get_draft_picks

        List of NFL Draft picks
        """
        query_string = [('year', 56),
                        ('nflTeam', 'nfl_team_example'),
                        ('college', 'college_example'),
                        ('conference', 'conference_example'),
                        ('position', 'position_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/draft/picks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_nfl_positions(self):
        """Test case for get_nfl_positions

        List of NFL positions
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/draft/positions',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_nfl_teams(self):
        """Test case for get_nfl_teams

        List of NFL teams
        """
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/draft/teams',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

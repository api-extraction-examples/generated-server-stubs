import unittest

from flask import json

from openapi_server.models.player import Player  # noqa: E501
from openapi_server.models.team import Team  # noqa: E501
from openapi_server.models.team_matchup import TeamMatchup  # noqa: E501
from openapi_server.models.team_talent import TeamTalent  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTeamsController(BaseTestCase):
    """TeamsController integration test stubs"""

    def test_get_fbs_teams(self):
        """Test case for get_fbs_teams

        FBS team list
        """
        query_string = [('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/teams/fbs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_roster(self):
        """Test case for get_roster

        Team rosters
        """
        query_string = [('team', 'team_example'),
                        ('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/roster',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_talent(self):
        """Test case for get_talent

        Team talent composite rankings
        """
        query_string = [('year', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/talent',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team_matchup(self):
        """Test case for get_team_matchup

        Team matchup history
        """
        query_string = [('team1', 'team1_example'),
                        ('team2', 'team2_example'),
                        ('minYear', 56),
                        ('maxYear', 56)]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/teams/matchup',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_teams(self):
        """Test case for get_teams

        Team information
        """
        query_string = [('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/teams',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

import unittest

from flask import json

from openapi_server.models.position_group_recruiting_rating import PositionGroupRecruitingRating  # noqa: E501
from openapi_server.models.recruit import Recruit  # noqa: E501
from openapi_server.models.team_recruiting_rank import TeamRecruitingRank  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRecruitingController(BaseTestCase):
    """RecruitingController integration test stubs"""

    def test_get_recruiting_groups(self):
        """Test case for get_recruiting_groups

        Recruit position group ratings
        """
        query_string = [('startYear', 56),
                        ('endYear', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/recruiting/groups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_recruiting_players(self):
        """Test case for get_recruiting_players

        Player recruiting ratings and rankings
        """
        query_string = [('year', 56),
                        ('classification', 'HighSchool'),
                        ('position', 'position_example'),
                        ('state', 'state_example'),
                        ('team', 'team_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/recruiting/players',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_recruiting_teams(self):
        """Test case for get_recruiting_teams

        Team recruiting rankings and ratings
        """
        query_string = [('year', 56),
                        ('team', 'team_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/recruiting/teams',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

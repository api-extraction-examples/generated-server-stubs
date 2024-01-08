import unittest

from flask import json

from openapi_server.models.conference_sp_rating import ConferenceSPRating  # noqa: E501
from openapi_server.models.team_elo_rating import TeamEloRating  # noqa: E501
from openapi_server.models.team_sp_rating import TeamSPRating  # noqa: E501
from openapi_server.models.team_srs_rating import TeamSRSRating  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRatingsController(BaseTestCase):
    """RatingsController integration test stubs"""

    def test_get_conference_sp_ratings(self):
        """Test case for get_conference_sp_ratings

        Historical SP+ ratings by conference
        """
        query_string = [('year', 56),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ratings/sp/conferences',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_elo_ratings(self):
        """Test case for get_elo_ratings

        Historical Elo ratings
        """
        query_string = [('year', 56),
                        ('week', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ratings/elo',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_sp_ratings(self):
        """Test case for get_sp_ratings

        Historical SP+ ratings
        """
        query_string = [('year', 56),
                        ('team', 'team_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ratings/sp',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_srs_ratings(self):
        """Test case for get_srs_ratings

        Historical SRS ratings
        """
        query_string = [('year', 56),
                        ('team', 'team_example'),
                        ('conference', 'conference_example')]
        headers = { 
            'Accept': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/ratings/srs',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

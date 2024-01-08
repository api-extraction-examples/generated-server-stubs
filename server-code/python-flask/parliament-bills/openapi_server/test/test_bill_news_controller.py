import unittest

from flask import json

from openapi_server.models.news_articles_summary_search_result import NewsArticlesSummarySearchResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBillNewsController(BaseTestCase):
    """BillNewsController integration test stubs"""

    def test_get_news_articles(self):
        """Test case for get_news_articles

        Returns a list of news articles for a Bill.
        """
        query_string = [('Skip', 56),
                        ('Take', 56)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/Bills/{bill_id}/NewsArticles'.format(bill_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

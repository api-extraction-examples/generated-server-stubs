import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.recommendation_dto import RecommendationDto  # noqa: E501
from openapi_server import util


def get_movie_recommendations(user_id=None, parent_id=None, fields=None, category_limit=None, item_limit=None):  # noqa: E501
    """Gets movie recommendations.

     # noqa: E501

    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param fields: Optional. The fields to return.
    :type fields: list | bytes
    :param category_limit: The max number of categories to return.
    :type category_limit: int
    :param item_limit: The max number of items to return per category.
    :type item_limit: int

    :rtype: Union[List[RecommendationDto], Tuple[List[RecommendationDto], int], Tuple[List[RecommendationDto], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'

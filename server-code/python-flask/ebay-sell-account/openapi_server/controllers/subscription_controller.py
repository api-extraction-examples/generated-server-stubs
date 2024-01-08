import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.subscription_response import SubscriptionResponse  # noqa: E501
from openapi_server import util


def get_subscription(limit=None, continuation_token=None):  # noqa: E501
    """get_subscription

    This method retrieves a list of subscriptions associated with the seller account. # noqa: E501

    :param limit: This field is for future use.
    :type limit: str
    :param continuation_token: This field is for future use.
    :type continuation_token: str

    :rtype: Union[SubscriptionResponse, Tuple[SubscriptionResponse, int], Tuple[SubscriptionResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

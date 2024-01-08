import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.feedback import Feedback  # noqa: E501
from openapi_server import util


def get_feedback(authorization, feedback_id):  # noqa: E501
    """get_feedback

    Retrieve feedback # noqa: E501

    :param authorization: Authorization token (provided upon successful login)
    :type authorization: str
    :param feedback_id: 
    :type feedback_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_feedback(body):  # noqa: E501
    """send_feedback

    Submit feedback for the bank # noqa: E501

    :param body: Feedback details including name, email the subject and complete message
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Feedback.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

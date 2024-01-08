import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.experience_response import ExperienceResponse  # noqa: E501
from openapi_server import util


def get_experience_homepage(x_api_key):  # noqa: E501
    """Homepage Experience

    Homepage Experience  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str

    :rtype: Union[ExperienceResponse, Tuple[ExperienceResponse, int], Tuple[ExperienceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'

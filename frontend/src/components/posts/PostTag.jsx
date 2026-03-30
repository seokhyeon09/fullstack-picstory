import React from 'react'
import './PostComponentAll.scss'

const PostTag = ({ tag }) => {
    return (
        <span className='post-tag'>
            <span>
                {tag}
            </span>
            <button className='post-tag-delete'>X</button>
        </span>
    )
}

export default PostTag